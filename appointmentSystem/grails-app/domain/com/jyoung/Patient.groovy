package com.jyoung

class Patient {
  String      patientName
  String      patientAddress
  String      patientResidence
  Date        patientDob
  String      patientID
  Date        dateRegistered
  int         patientPhone
  static      hasOne    = [appointment:Appointment]
  static      hasMany   = [surguries:Surgery, prescriptions:Prescription , doctors:Doctor]
  static      belongTo  = [surgery:Surgery  , doctor:Doctor]
    static constraints = {
      patientName       nullable: false , blank: false
      patientAddress    nullable: false , blank: false
      patientResidence  nullable: false , blank: false
      patientDob        nullable: false , blank: false
      patientID         nullable: false , blank: false
      dateRegistered    nullable: false , blank: false
      patientPhone      nullable: false , blank: false
    }
}
