package com.jyoung

class Prescription {
  String  pharmacyName
  int     prescripNumber
  String  medicine
  double  totalCost
  Date    dateIssued
  boolean patientPaying
  Doctor  doctor
  Patient patient

static belongsTo = [Doctor , Patient]

  String toString(){
    return prescripNumber;
  }

  static constraints = {
    pharmacyName    nullable: false , blank: false
    prescripNumber  nullable: false , blank: false
    medicine        nullable: false , blank: false
    totalCost       nullable: false , blank: false
    dateIssued      nullable: false , blank: false
    patientPaying   nullable: false , blank: false
  }
}
