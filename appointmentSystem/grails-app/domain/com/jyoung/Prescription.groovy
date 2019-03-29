package com.jyoung

class Prescription {
  String  pharmacyName
  int     prescripNumber
  String  medicine
  double  totalCost
  Date    dateIssued
  boolean patientPaying
    static constraints = {
    }
}
