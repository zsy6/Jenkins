#!groovy
pipeline{
    agent any

    stages{
        stages('Build'){
            steps{
                echo 'get Jenkinsfile from git'
            }
        }
    }
}