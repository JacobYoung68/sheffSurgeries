package com.jyoung

class Appointment {
  Date    appDate
  String  appTime
  int     appDuration
  String  roomNumber
  static  hasOne=[patient:Patient , doctor:Doctor]
    static constraints = {
      appDate     nullable: false , blank: false
      appTime     nullable: false , blank: false
      appDuration nullable: false , blank: false
      roomNumber  nullable: false , blank: false
    }
}
