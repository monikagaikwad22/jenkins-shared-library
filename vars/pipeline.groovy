def call() {

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo "Building Application"
            }
        }

        stage('Test') {
            steps {
                echo "Running Tests"
            }
        }

        stage('Scan') {
            steps {
                echo "Security Scan"
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying Application"
            }
        }

    }

}
}
