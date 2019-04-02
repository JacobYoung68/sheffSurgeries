package com.jyoung

class Doctor {
  String  fullName
  String  qualification
  String  position
  String  doctorEmail
  String  password
  String  doctorOffice
  String  doctorPhone
  String  bio
  Surgery surgery
  Patient patient
  Nurse   nurse

static hasMany = [prescriptions: Prescription , appointments: Appointment , patients: Patient , nurses: Nurse]
static belongsTo = [Surgery]

  String toString(){
    return fullName;
  }

  static constraints = {
    fullName        nullable: false , blank: false
    qualification   nullable: false , blank: false
    position        nullable: false , blank: false
    doctorEmail     nullable: false , blank: false, email: true
    password        nullable: false , blank: false
    doctorOffice    nullable: false , blank: false
    doctorPhone     nullable: false , blank: false
    bio             nullable: false , blank: false , widget: 'textarea'
    nurse           nullable: true , blank: true
    patient         nullable: true , blank: true
    surgery         nullable: true , blank: true
  }
}
