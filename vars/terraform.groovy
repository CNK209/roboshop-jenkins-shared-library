def call() {
    pipeline {
        agent {
            node{
                label 'workstation'
            }
        }
        parameters {
            string(name:'infra_env', defaultValue: '', description: 'enter env like dev or prod')
        }
        stages {
            stage('Terraform Init') {
                steps {
                    sh "teraform init -backend-config=env-${infra_env}/state.tfvars"

                }
            }

        }
    }
}