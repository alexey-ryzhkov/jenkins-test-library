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
