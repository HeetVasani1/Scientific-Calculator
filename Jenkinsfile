pipeline {
    environment{
            docker_image = ""
    }
    agent any
    stages {
        stage('Step 1: Git Clone') {
            steps {
                git branch:'main', url:'https://github.com/HeetVasani1/Scientific-Calculator.git'
            }
        }
        stage('Step 2: Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Step 3: Build Docker Image'){
            steps {
                script {
                    docker_image = docker.build "heetvasani1/scientificcalculator:latest"
                    }
            }
        }
        stage('Stage 4: Push docker image to hub') {
            steps{
                script{
                    docker.withRegistry('', 'docker'){
                        docker_image.push()
                        }
                    }
            }
        }
        stage('Stage 5: Clean docker images'){
            steps{
                script{
                    sh ‘docker container prune -f’
                    sh ‘docker image prune -f
                }
            }
        }
    }
}
