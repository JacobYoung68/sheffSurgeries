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
    ).save(failOnError:true)

    //def ehc = new Surgery(
    //  name:             'Encliffe Health Centre',
    //  address:          '2 EHC, Old Ln',
    //  postcode:         'S11 2BC',
    //  telephone:        '0114 458 5746',
    //  numberOfPatients: 290,
    //  description:      'Lorem ipsum.',
    //  openingTime:      '8.30am'
    //).save()

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
    ).save(failOnError:true)

    //def eDoe = new Doctor(
    //  fullName:      'Emma Doe',
    //  qualification: 'MBChB(Sheffield)',
    //  position:      'GP, Surgeon',
    //  doctorEmail:   'eDoe_Doc@health.com',
    //  password:      'notsecure123',
    //  doctorOffice:  '1a',
    //  doctorPhone:   '0114 458 3254',
    //  bio:           'Lorem ipsum.',
    //  surgery:       ehc
    //).save()

    def aRichards = new Nurse(
      nurseName:       'Alice Richards',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'aRichards_Nurse@health.com',
      nurseOffice:     '2a',
      nursePhone:      '0114 458 1295',
      surgery:         shc,
      doctor:          jSmith
    ).save(failOnError:true)

    //def bFred = new Nurse(
    //  nurseName:       'Barry Fred',
    //  qualifications:  'Registered General Nurse',
    //  nurseEmail:      'bFred_Nurse@health.com',
    //  nurseOffice:     '4a',
    //  nursePhone:      '0114 458 9548',
    //  surgery:         shc,
    //  doctor:          jSmith
    //).save()

    //def cEdwards = new Nurse(
    //  nurseName:       'Craig Edwards',
    //  qualifications:  'Registered General Nurse',
    //  nurseEmail:      'cEdwards_Nurse@health.com',
    //  nurseOffice:     '8b',
    //  nursePhone:      '0114 458 1548',
    //  surgery:         ehc,
    //  doctor:          eDoe
    //).save()

    //def hRyan = new Nurse(
    //  nurseName:       'Harriet Ryan',
    //  qualifications:  'Registered General Nurse',
    //  nurseEmail:      'hRyan_Nurse@health.com',
    //  nurseOffice:     '8c',
    //  nursePhone:      '0114 458 1547',
    //  surgery:         ehc,
    //  doctor:          eDoe
    //).save()

    def gWilson = new Patient(
      patientName:       'Gary Wilson',
      patientAddress:    '13 Eastwood Rd',
      patientResidence:  'Sheffield',
      patientDob:        new Date('18/08/1998'),
      patientID:         'P000001',
      dateRegistered:    new Date('01/02/2019'),
      patientPhone:      '07485612547',
      surgery:           shc,
      doctor:            jSmith
    ).save(failOnError: true)

    def app1 = new Appointment(
      appDate:      new Date('29/04/2019'),
      appTime:      '5.25pm',
      appDuration:  30,
      roomNumber:   '23b',
      doctor:       jSmith,
      patient:      gWilson
    ).save(failOnError: true)

//gWilson.addToSurgeries(shc)

//aRichards.addToDoctors(jSmith)
//gWilson.addToDoctors(jSmith)






  }
  def destroy = {
  }
}
