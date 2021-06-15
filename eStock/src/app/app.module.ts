import '@angular/compiler';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ToastrModule } from 'ngx-toastr';
import {ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { AddClientComponent } from './client/add-client/add-client.component';
import { ListClientComponent } from './client/list-client/list-client.component';
import { AddCategorieComponent } from './categorie/add-categorie/add-categorie.component';
import { ListCategorieComponent } from './categorie/list-categorie/list-categorie.component';
import { AddScategorieComponent } from './scategorie/add-scategorie/add-scategorie.component';
import { ListScategorieComponent } from './scategorie/list-scategorie/list-scategorie.component';
import { AddFourComponent } from './fournisseur/add-four/add-four.component';
import { ListFourComponent } from './fournisseur/list-four/list-four.component';

import { AddArticleComponent } from './article/add-article/add-article.component';
import { ListArticleComponent } from './article/list-article/list-article.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes  } from '@angular/router';
import { MatDialogModule } from '@angular/material/dialog';
import { MatToolbarModule } from'@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogRef } from '@angular/material/dialog';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FlexModule } from '@angular/flex-layout';
//import { AuthGuardService } from './auth/auth-guard.service.ts';
import { AuthGuardGuard } from './auth/auth-guard.guard';


import { DatePipe } from '@angular/common';


import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { AddCommComponent } from './comm/add-comm/add-comm.component';
import { ListCommComponent } from './comm/list-comm/list-comm.component';
import { AddLcommandeComponent } from './comm/add-lcommande/add-lcommande.component';
import { ListLcommandeComponent } from './comm/list-lcommande/list-lcommande.component';
import { FormsModule } from '@angular/forms';
import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './user/login/login.component';
import { RegisterComponent } from './user/register/register.component';
import { MenuComponent } from './menu/menu.component';




const MATERIAL_MODULES = [MatToolbarModule,
  MatIconModule
];

const appRoutes : Routes =[
  {path: '', redirectTo: 'login', pathMatch: 'full', canActivate: [AuthGuardGuard]},
  {path: '', component:MenuComponent, children : [
  {path: 'clients' , component: ListClientComponent},
  {path: 'client' , component: AddClientComponent},
  {path: 'categories', component: ListCategorieComponent},
  {path: 'categorie', component: AddCategorieComponent},
  {path: 'scategories', component: ListScategorieComponent},
  {path: 'scategorie', component: AddScategorieComponent},
  {path: 'articles', component: ListArticleComponent},
  {path: 'article', component: AddArticleComponent},
  {path: 'fournisseurs', component: ListFourComponent},
  {path: 'fournisseur', component: AddFourComponent},
  {path: 'comm', component: AddCommComponent },
  {path: 'lcomm', component: ListCommComponent},]},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}

  
  
  

];


@NgModule({
  declarations: [
    AppComponent,
    AddClientComponent,
    ListClientComponent,
    AddCategorieComponent,
    ListCategorieComponent,
    AddArticleComponent,
    ListArticleComponent,
    ListScategorieComponent,
    AddScategorieComponent,
    AddArticleComponent,
    ListArticleComponent,
    AddFourComponent,
    ListFourComponent,
    ListCommComponent,
    AddCommComponent,
    ListLcommandeComponent,
    AddLcommandeComponent,
    AddCommComponent,
    ListCommComponent,
    AddLcommandeComponent,
    ListLcommandeComponent,
    ListUserComponent,
    LoginComponent,
    RegisterComponent,
    LoginComponent,
    ListUserComponent,
    MenuComponent,
    
    
   // ClientComponent,
  //  FournisseurComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    HttpClientModule,
    MatDialogModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatToolbarModule,
    MatIconModule,
    NgbModule,
    FlexLayoutModule,
    FormsModule  ,
    FlexModule,
    //RegisterComponent


  ],
  exports : MATERIAL_MODULES,
  providers: [DatePipe,{ provide: MAT_DIALOG_DATA, useValue: {} ,},
    { provide: MatDialogRef, useValue: {} }],

  bootstrap: [AppComponent],
  entryComponents: [AddCategorieComponent]
})
export class AppModule { }
