import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import axios from 'axios';
import Employee from './interfaces/Employee';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})


export class AppComponent {

  

  title: string = 'spring-dashboard';
  employees: Employee[] = []

  constructor() {
    this.getPosts()
  }

  async getPosts() {
    axios.get('http://localhost:8080/api/employees/all')
    .then((response) => {
      // handle success
      console.log(response.data);
      this.employees = response.data.employeeArr
    })
    .catch( (error) => {
      // handle error
      this.employees = []
    })
    .finally(function () {
      // always executed
    });
  }
}
