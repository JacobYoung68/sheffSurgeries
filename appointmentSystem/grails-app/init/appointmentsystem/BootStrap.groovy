package com.jyoung

class BootStrap {
  def init = { servletContext ->
    def sheffieldHealthCentre = new Surgery(
      name:             'Sheffield Health Centre',
      address:          '1 SHC, Main St',
      postcode:         'S1 1AB',
      telephone:        '0161456982',
      numberOfPatients: '410',
      description:      'Lorem ipsum',
      openingTime:      '8am'
    ).save()

    def rotherhamHealthCentre = new Surgery(
      name:             'Rotherham Health Centre',
      address:          '2 RHC, Other Main St',
      postcode:         'S16 2BC',
      telephone:        '0161946715',
      numberOfPatients: '340',
      description:      'Lorem ipsum',
      openingTime:      '8.30am'
    ).save()




  }
  def destroy = {
  }
}
