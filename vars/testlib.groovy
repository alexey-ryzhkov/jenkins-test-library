def unit_function(UNIT_TESTS) {
    
    if ("${UNIT_TESTS}" == 'on') {
        sh "cat test123123123.file"
    }
    else {
        sh "echo testing echo"
    }

}