package com.jyoung

class Prescription {
  String  pharmacyName
  int     prescripNumber
  String  medicine
  float   totalCost
  Date    dateIssued
  boolean patientPaying
    static constraints = {
    }
}
