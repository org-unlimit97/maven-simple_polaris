pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo "Building with system Maven..."
                bat "mvn clean compile"
            }
        }
    }
}
