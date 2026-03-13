def call() {

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo "Building Application"
                sh 'docker build -t myapp .'
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
