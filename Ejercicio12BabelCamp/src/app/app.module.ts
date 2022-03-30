import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './componentes/login/login.component';
import { CabeceraComponent } from './componentes/cabecera/cabecera.component';
import { BioComponent } from './componentes/bio/bio.component';
import { JuegosComponent } from './componentes/juegos/juegos.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { FormsModule } from '@angular/forms';
import { MenuComponent } from './componentes/menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CabeceraComponent,
    BioComponent,
    JuegosComponent,
    ContactoComponent,
    MenuComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
