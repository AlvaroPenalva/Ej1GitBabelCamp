import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BioComponent } from './componentes/bio/bio.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { JuegosComponent } from './componentes/juegos/juegos.component';
import { LoginComponent } from './componentes/login/login.component';

const routes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'bio', component: BioComponent},
  {path: 'juegos/:usuario', component: JuegosComponent},
  {path: 'contacto', component: ContactoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
