package org.specs2
package specification

import control.LazyParameters._

private[specs2]
trait PredefinedFragments {
  def p = StandardFragments.Par()
  def br = StandardFragments.Br()
  def end = StandardFragments.End()
  def t = StandardFragments.Tab()
  def u = StandardFragments.Untab()
  def endp = Fragments(end, p)
}
private[specs2]
object PredefinedFragments extends PredefinedFragments

