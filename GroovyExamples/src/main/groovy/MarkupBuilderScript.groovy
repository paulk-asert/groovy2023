import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def xml = new MarkupBuilder(writer)

xml.project {
    modelVersion('4.0.0')
    groupId('org.apache.groovy')
    artifactId('groovy-examples')
    version('1.0-SNAPSHOT')
}

assert writer.toString() == '''<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.apache.groovy</groupId>
  <artifactId>groovy-examples</artifactId>
  <version>1.0-SNAPSHOT</version>
</project>'''
