pipeline {
    agent any

    environment {
        REPO_URL = 'https://github.com/jilutony/maven-simple.git'
    }

    stages {

        stage('Build1') {
            steps {
                sh 'mvn -B package --file pom.xml'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
                echo "test success"
            }
        }
    }
}
