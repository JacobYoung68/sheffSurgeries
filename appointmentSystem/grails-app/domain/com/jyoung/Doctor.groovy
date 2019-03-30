package com.jyoung

class Doctor {
  String  fullName
  String  qualification
  String  position
  String  doctorEmail
  String  password
  String  doctorOffice
  int     doctorPhone
  String  bio
  static hasMany=[patients:Patient , nurses:Nurse , appointments:Appointment , prescriptions:Prescription]
  static hasOne=[surgery:Surgery]
    static constraints = {
      fullName        nullable: false , blank: false
      qualification   nullable: false , blank: false
      position        nullable: false , blank: false
      doctorEmail     nullable: false , blank: false, email: true
      password        nullable: false , blank: false
      doctorOffice    nullable: false , blank: false
      doctorPhone     nullable: false , blank: false
      bio             nullable: false , blank: false , widget: 'textarea'
    }
}
