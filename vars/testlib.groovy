def unit_function(UNIT_TESTS) {
//    catchError(buildResult: 'Unstable', stageResult: 'FAILURE') {
    if ("${UNIT_TESTS}" == 'on') {
        sh "cat test123123123.file"
    }
    
    else {
        sh 'echo "testing echo"'
    }
    
//    }
    
}