package com.jyoung

class BootStrap {
  def init = { servletContext ->

    def shc = new Surgery(
      name:             'Sheffield Health Centre',
      address:          '1 SHC, Main St',
      postcode:         'S1 1AB',
      telephone:        '0114 458 8954',
      numberOfPatients: 410,
      description:      'Lorem ipsum.',
      openingTime:      '8am'
    ).save()

    def ehc = new Surgery(
      name:             'Encliffe Health Centre',
      address:          '2 EHC, Old Ln',
      postcode:         'S11 2BC',
      telephone:        '0114 458 5746',
      numberOfPatients: 290,
      description:      'Lorem ipsum.',
      openingTime:      '8.30am'
    ).save()

    def jSmith = new Doctor(
      fullName:      'John Smith',
      qualification: 'MBChB(Manchester)',
      position:      'GP, Surgeon',
      doctorEmail:   'jSmith_Doc@health.com',
      password:      'verysecurepassword123',
      doctorOffice:  '11b',
      doctorPhone:   '0114 458 6548',
      bio:           'Lorem ipsum.',
      surgery:       shc
    ).save()

    def eDoe = new Doctor(
      fullName:      'Emma Doe',
      qualification: 'MBChB(Sheffield)',
      position:      'GP, Surgeon',
      doctorEmail:   'eDoe_Doc@health.com',
      password:      'notsecure123',
      doctorOffice:  '1a',
      doctorPhone:   '0114 458 3254',
      bio:           'Lorem ipsum.',
      surgery:       ehc
    ).save()

    def aRichards = new Nurse(
      nurseName:       'Alice Richards',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'aRichards_Nurse@health.com',
      nurseOffice:     '2a',
      nursePhone:      '0114 458 1295',
      surgery:         shc,
      doctor:          jSmith
    ).save()

    def bFred = new Nurse(
      nurseName:       'Barry Fred',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'bFred_Nurse@health.com',
      nurseOffice:     '4a',
      nursePhone:      '0114 458 9548',
      surgery:         ehc,
      doctor:          eDoe
    ).save()

shc.addToDoctor(jSmith)
shc.addToNurse(aRichards)

ehc.addToDoctor(eDoe)
ehc.addToNurse(bFred)

jSmith.addToNurse(aRichards)
eDoe.addToNurse(bFred)

  }
  def destroy = {
  }
}
