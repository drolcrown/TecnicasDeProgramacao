package controllers

import javax.persistence._

/**
  * Created by aeron on 05/09/17.
  */

@Entity
@Id
@Table(name = "User")
class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Int = _
  var nome = ""
  var renda = 0.0
  var gastos = new Expense

  def getNome() : String = {
    nome
  }

  def setNome(name : String) : Unit = {
    this.nome = name
  }

  def getRenda() : Double = {
    renda
  }

  def setRenda(renda: Double) : Unit = {
    this.renda = renda
  }

  def getGastos() : Double  = {
    gastos.getLeisure() + gastos.getFeeding() + gastos.getNecessary() + gastos.getTransport()
  }

  def setGastos(tranport : Double, feeding : Double, necessary : Double, leisure : Double) : Unit = {
    gastos.setFeeding(feeding)
    gastos.setLeisure(leisure)
    gastos.setNecessary(necessary)
    gastos.setTransport(tranport)
  }

}