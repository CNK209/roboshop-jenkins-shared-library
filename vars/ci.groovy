def call() {
    pipeline {
        agent {
            label 'workstation'
        }
        stages {

            stage('compile') {
                steps {
                    echo 'compile'
                }
            }
            stage('unit test') {
                steps {
                    echo 'unit test'
                }
            }
            stage('quality control') {
                steps {
                    echo 'quality control'
                }
            }
            stage('upload code to centralized place') {
                steps {
                    echo 'upload'
                }
            }
        }
    }
}