package com.jyoung

class BootStrap {
  def init = { servletContext ->

    def jSmith = new Doctor(
      fullName:      'John Smith',
      qualification: 'MBChB(Manchester)',
      position:      'GP, Surgeon',
      doctorEmail:   'jSmith_Doc@health.com',
      password:      'verysecurepassword123',
      doctorOffice:  '11b',
      doctorPhone:   '0114 458 6548',
      bio:           'Lorem ipsum.'
    ).save()

    def eDoe = new Doctor(
      fullName:      'Emma Doe',
      qualification: 'MBChB(Sheffield)',
      position:      'GP, Surgeon',
      doctorEmail:   'eDoe_Doc@health.com',
      password:      'password123',
      doctorOffice:  '8a',
      doctorPhone:   '0114 458 1548',
      bio:           'Lorem ipsum.'
    ).save()

    def aRichards = new Nurse(
      nurseName:       'Alice Richards',
      qualifications:  'Registered General Nurse',
      nurseEmail:      'aRichards_Nurse@health.com',
      nurseOffice:     '2a',
      nursePhone:      '0114 458 1295'
      ).save()

      def bFred = new Nurse(
        nurseName:       'Barry Fred',
        qualifications:  'Registered General Nurse',
        nurseEmail:      'bFred_Nurse@health.com',
        nurseOffice:     '2b',
        nursePhone:      '0114 458 1872'
        ).save()

      def sheffieldHealthCentre = new Surgery(
        name:             'Sheffield Health Centre',
        address:          '1 SHC, Main St',
        postcode:         'S1 1AB',
        telephone:        '0114 458 8954',
        numberOfPatients: '410',
        description:      'Lorem ipsum.',
        openingTime:      '8am'
      ).save()

      def rotherhamHealthCentre = new Surgery(
        name:             'Rotherham Health Centre',
        address:          '2 RHC, Other Main St',
        postcode:         'S16 2BC',
        telephone:        '0114 458 5975',
        numberOfPatients: '340',
        description:      'Lorem ipsum.',
        openingTime:      '8.30am'
      ).save()



  }
  def destroy = {
  }
}
