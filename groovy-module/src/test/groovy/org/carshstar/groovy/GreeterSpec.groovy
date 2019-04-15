package org.carshstar.groovy

import org.crashstar.java.Greeter
import spock.lang.Specification

class GreeterSpec extends Specification {

    def 'Calling the entry point'() {

        setup: 'Re-route standard out'
        def buf = new ByteArrayOutputStream(1024)
        System.out = new PrintStream(buf)

        when: 'The entrypoint is executed'
        Greeter.main('gradlephant')

        then: 'The correct greeting is output'
        buf.toString() == "Hello, Gradlephant\n".denormalize()
    }
}
