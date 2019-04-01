package com.jyoung

class Appointment {
  Date        appDate
  String      appTime
  int         appDuration
  String      roomNumber
  Patient     patient
  Surgery     surgery
  Doctor      doctor

  String toString(){
    return appDate;
  }

  static constraints = {
    appDate     nullable: false , blank: false
    appTime     nullable: false , blank: false
    appDuration nullable: false , blank: false
    roomNumber  nullable: false , blank: false
    patient     nullable: true , blank: false
    doctor      nullable: true , blank: false
    surgery     nullable: true , blank: false
  }
}
