package com.jyoung

class Appointment {
  Date        appDate
  String      appTime
  int         appDuration
  String      roomNumber
  Patient     patient
  Doctor      doctor
  Surgery     surgery

  static belongsTo = [Patient , Doctor, Surgery]

  String toString(){
    return appDate;
  }

  static constraints = {
    appDate     nullable: false , blank: false
    appTime     nullable: false , blank: false
    appDuration nullable: false , blank: false
    roomNumber  nullable: false , blank: false
    patient     nullable: true  , blank: true
    doctor      nullable: true  , blank: true
    surgery     nullable: true  , blank: true
  }
}
