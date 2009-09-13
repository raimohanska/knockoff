package knockoff2

import scala.xml.Group

class GroupSpan( val children : SpanSeq ) extends ComplexSpan {
 
    def this( seq : Seq[ Span ] ) {
        this( new SpanSeq { def theSeq = seq } )
    }
    
    def xml = Group( children.map( _.xml ) )
    
    def markdown = children.map( _.markdown ).mkString("")
}