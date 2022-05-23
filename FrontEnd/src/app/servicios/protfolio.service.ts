import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProtfolioService {

  constructor() { }
  obtenerDatos() {
    console.log("El servicio portfolio está corriendo");
  }
}
