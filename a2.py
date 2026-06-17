
from flask import Flask, request
import sqlite3
import os
import pickle

app = Flask(__name__)

# ❌ 1. SQL Injection (Critical)
@app.route("/login", methods=["POST"])
def login():
    username = request.form["username"]
    password = request.form["password"]

    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()

    # 취약한 쿼리 (string concatenation)
    query = f"SELECT * FROM users WHERE username='{username}' AND password='{password}'"
    cursor.execute(query)

    user = cursor.fetchone()
    conn.close()

    if user:
        return "Login success"
    else:
        return "Login failed"


# ❌ 2. Command Injection (Critical)
@app.route("/ping", methods=["GET"])
def ping():
    host = request.args.get("host")

    # 사용자 입력을 그대로 shell로 전달
    result = os.popen(f"ping -c 1 {host}").read()
    return result


# ❌ 3. Insecure Deserialization (Critical)
@app.route("/load", methods=["POST"])
def load_data():
    data = request.files["file"].read()

    # 검증 없이 pickle 로드
    obj = pickle.loads(data)
    return str(obj)


# ❌ 4. Path Traversal (High)
@app.route("/readfile", methods=["GET"])
def read_file():
    filename = request.args.get("filename")

    # 경로 검증 없음
    with open(f"./data/{filename}", "r") as f:
        return f.read()


# ❌ 5. Hardcoded Secret (High)
SECRET_KEY = "super-secret-password"


# ❌ 6. Debug mode 활성화 (High)
if __name__ == "__main__":
    app.run(debug=True)



