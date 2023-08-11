import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Cliente } from '../modelos/Cliente';



@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http:HttpClient) { }
  url = 'http://localhost:8080/api/clientes';

  getClientes(){
    return this.http.get<Cliente[]>(this.url);
  }
}
