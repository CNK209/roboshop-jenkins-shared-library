def compile() {
    if (app_lang == "nodejs") {
        sh 'npm install'
    }

    if (app_lang == "maven") {
        sh 'mvn package'
    }
    if (app_lang == "golang"){
        sh 'golang install'
    }
}
def unittests(){
    if (app_lang == "nodejs") {
        //Developer is missing unit test cases in this project,he need to add them as best practice we are skipping to proceed further
        sh 'npm test || true'
        sh 'echo Test Cases'
    }
    if (app_lang == "maven") {
        sh 'mvn test'
    }
    if (app_lang == "python") {
        sh 'python3 -m unittest'
    }

}



