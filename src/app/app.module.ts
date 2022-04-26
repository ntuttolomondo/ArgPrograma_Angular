import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { SeparadorComponent } from './componentes/separador/separador.component';
import { AsideComponent } from './componentes/aside/aside.component';
import { SectionComponent } from './componentes/section/section.component';
import { ProfileComponent } from './componentes/profile/profile.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { Pagina404Component } from './componentes/pagina404/pagina404.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BannerComponent,
    SeparadorComponent,
    AsideComponent,
    SectionComponent,
    ProfileComponent,
    ExperienciaComponent,
    EducacionComponent,
    Pagina404Component,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
