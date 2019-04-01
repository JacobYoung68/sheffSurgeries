package com.jyoung

class Receptionist {
  String  recepName
  String  recepEmail
  String  recepUsername
  String  recepPassword
  String  recepPhone
  Surgery surgery

  String toString(){
    return recepName;
  }

  static constraints = {
    recepName     nullable: false , blank: false
    recepEmail    nullable: false , blank: false, email: true
    recepUsername nullable: false , blank: false
    recepPassword nullable: false , blank: false
    recepPhone    nullable: false , blank: false
  }
}
