//
// Generated from archetype; please customize.
//

package com.acme.groovy.maven

import com.acme.groovy.maven.Example
import com.acme.groovy.maven.Helper

import groovy.util.GroovyTestCase

/**
 * Tests for the {@link Helper} class.
 */
class HelperTest
    extends GroovyTestCase
{
    void testHelp() {
        new Helper().help(new Example())
    }
}
