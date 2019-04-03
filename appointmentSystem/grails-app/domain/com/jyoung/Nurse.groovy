package com.jyoung

class Nurse {
  String  nurseName
  String  qualifications
  String  nurseEmail
  String  nurseOffice
  String  nursePhone
  Surgery surgery

static hasMany = [doctors: Doctor]
static belongsTo = [Doctor, Surgery]

  String toString(){
    return nurseName;
  }

  static constraints = {
    nurseName       nullable: false , blank: false
    qualifications  nullable: false , blank: false
    nurseEmail      nullable: false , blank: false, email: true
    nurseOffice     nullable: false , blank: false
    nursePhone      nullable: false , blank: false
    surgery         nullable: true  , blank: true
  }
}
