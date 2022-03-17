#!groovy
pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'get Jenkinsfile from git'
            }
        }
    }
}