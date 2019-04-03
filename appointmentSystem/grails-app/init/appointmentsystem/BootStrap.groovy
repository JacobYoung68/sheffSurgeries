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

    def ehc = new Surgery(
      name:             'Encliffe Health Centre',
      address:          '2 EHC, Old Ln',
      postcode:         'S11 2BC',
      telephone:        '0114 458 5746',
      numberOfPatients: 290,
      description:      'Lorem ipsum.',
      openingTime:      '8.30am'
    ).save(failOnError:true)

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
    ).save(failOnError:true)

    def oJohn = new Doctor(
      fullName:      'Oliver John',
      qualification: 'MBChB(Leeds)',
      position:      'GP, Surgeon',
      doctorEmail:   'oJohn_Doc@health.com',
      password:      'password33',
      doctorOffice:  '14c',
      doctorPhone:   '0114 458 3999',
      bio:           'Lorem ipsum.',
      surgery:       ehc
    ).save(failOnError:true)

    def aRichards = new Nurse(
      nurseName:       'Alice Richards',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'aRichards_Nurse@health.com',
      nurseOffice:     '2a',
      nursePhone:      '0114 458 1295',
      surgery:         shc
    ).save(failOnError:true)

    def bFred = new Nurse(
      nurseName:       'Barry Fred',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'bFred_Nurse@health.com',
      nurseOffice:     '4a',
      nursePhone:      '0114 458 9548',
      surgery:         shc
    ).save()

    def cEdwards = new Nurse(
      nurseName:       'Craig Edwards',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'cEdwards_Nurse@health.com',
      nurseOffice:     '8b',
      nursePhone:      '0114 458 1548',
      surgery:         ehc
    ).save()

    def hRyan = new Nurse(
      nurseName:       'Harriet Ryan',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'hRyan_Nurse@health.com',
      nurseOffice:     '8c',
      nursePhone:      '0114 458 1547',
      surgery:         ehc
    ).save()

    def gWilson = new Patient(
      patientName:       'Gary Wilson',
      patientAddress:    '13 Eastwood Rd',
      patientResidence:  'Sheffield',
      patientDob:        new Date('18/08/1998'),
      patientID:         'P000001',
      dateRegistered:    new Date('01/02/2019'),
      patientPhone:      '07485612547'
    ).save(failOnError: true)

    def rIris = new Patient(
      patientName:       'Rachael Iris',
      patientAddress:    '56 Psalter Ln',
      patientResidence:  'Sheffield',
      patientDob:        new Date('06/12/1986'),
      patientID:         'P000001',
      dateRegistered:    new Date('21/03/2019'),
      patientPhone:      '07415463285'
    ).save(failOnError: true)

    def app1 = new Appointment(
      appDate:      new Date('29/04/2019'),
      appTime:      '5.25pm',
      appDuration:  30,
      roomNumber:   '23b',
      doctor:       jSmith,
      patient:      gWilson,
      surgery:      shc
    ).save(failOnError: true)

    def app2 = new Appointment(
      appDate:      new Date('30/04/2019'),
      appTime:      '2.15pm',
      appDuration:  45,
      roomNumber:   '21a',
      doctor:       oJohn,
      patient:      rIris,
      surgery:      ehc
    ).save(failOnError: true)

    def aWright = new Receptionist(
      recepName:     'Andrea Wright',
      recepEmail:    'aWright_Recep@health.com',
      recepUsername: 'aWright',
      recepPassword: 'gr8Psswrd',
      recepPhone:    '0114 458 0001',
      surgery:       shc
    ).save(failOnError: true)

    def pMan = new Receptionist(
      recepName:     'Peter Man',
      recepEmail:    'pMan_Recep@health.com',
      recepUsername: 'pMan',
      recepPassword: 'badPsswrd',
      recepPhone:    '0114 458 0002',
      surgery:       ehc
    ).save(failOnError: true)

    def presc1 = new Prescription(
      pharmacyName:    'Sheffield Pharmacy',
      prescripNumber:  1,
      medicine:        'Meth',
      totalCost:       12.50,
      dateIssued:      new Date('02/02/2019'),
      patientPaying:   true,
      doctor:          jSmith,
      patient:         gWilson
    ).save(failOnError: true)

    def presc2 = new Prescription(
      pharmacyName:    'Encliffe Pharmacy',
      prescripNumber:  2,
      medicine:        'Calpol',
      totalCost:       250.75,
      dateIssued:      new Date('24/02/2019'),
      patientPaying:   false,
      doctor:          oJohn,
      patient:         rIris
    ).save(failOnError: true)

jSmith.addToNurses(aRichards)
jSmith.addToNurses(bFred)
eDoe.addToNurses(cEdwards)
oJohn.addToNurses(cEdwards)
oJohn.addToNurses(hRyan)

shc.addToPatients(gWilson)
jSmith.addToPatients(gWilson)

ehc.addToPatients(rIris)
shc.addToPatients(rIris)
jSmith.addToPatients(rIris)
oJohn.addToPatients(rIris)

  }
  def destroy = {
  }
}
