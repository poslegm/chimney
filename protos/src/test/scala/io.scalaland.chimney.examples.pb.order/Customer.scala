// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.scalaland.chimney.examples.pb.order

@SerialVersionUID(0L)
final case class Customer(
    id: _root_.scala.Int = 0,
    firstName: _root_.scala.Predef.String = "",
    lastName: _root_.scala.Predef.String = "",
    address: _root_.scala.Option[io.scalaland.chimney.examples.pb.order.Address] = _root_.scala.None
)
