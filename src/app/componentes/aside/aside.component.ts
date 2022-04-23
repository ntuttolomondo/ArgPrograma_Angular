import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';


@Component({
  selector: 'app-aside',
  templateUrl: './aside.component.html',
  styleUrls: ['./aside.component.css']
})
export class AsideComponent implements OnInit {
  skillsList:any;
  idiomasList:any;

  constructor(private datosPortfolio: PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      this.skillsList=data.skills;
    }); 
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      this.idiomasList=data.idiomas;
    }); 
    }
}