package org.crashstar.groovy

import groovy.transform.CompileStatic

@CompileStatic
class GreetingFormatter {
    static String greeting(final String name) {
        "Hello, ${name.capitalize()}"
    }
}
