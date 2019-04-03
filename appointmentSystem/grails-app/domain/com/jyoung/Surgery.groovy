package com.jyoung

class Surgery {
  String  name
  String  address
  String  postcode
  String  telephone
  int     numberOfPatients
  String  description
  String  openingTime

static hasMany = [nurses: Nurse , doctors: Doctor, receptionists: Receptionist, appointments: Appointment, patients: Patient]

  String toString(){
    return name;
  }

  static constraints = {
    name              nullable: false , blank: false
    address           nullable: false , blank: false
    postcode          nullable: false , blank: false
    telephone         nullable: false , blank: false
    numberOfPatients  nullable: false , blank: false
    description       nullable: false , blank: false, widget: 'textarea'
    openingTime       nullable: false , blank: false
  }
}
