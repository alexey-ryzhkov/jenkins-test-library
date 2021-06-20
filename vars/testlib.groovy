def unit_function(blabla) {
//    catchError(buildResult: 'Unstable', stageResult: 'FAILURE') {
    if ("${blabla}" == 'on') {
        sh "cat test123123123.file"
    }
    
    else {
        sh 'echo "testing echo from branch new_branch tag v1.1"'
    }
    
//    }
    
}

def variable_check(test_env) {

    if ("${test_env}" == '1') {
        sh 'echo "The number was 1"'
    }
    
    else {
        sh 'echo "The number was SOMETHING ELSE"'
    }

}