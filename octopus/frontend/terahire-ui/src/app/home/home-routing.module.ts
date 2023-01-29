import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { CalendarComponent } from './calendar/calendar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomeComponent } from './home.component';
import { RecruitmentComponent } from './recruitment/recruitment.component';
import { SettingsComponent } from './settings/settings.component';

const routes: Routes = [

  {
    path:"",
    component:HomeComponent,
    children:[
      {
        path:"dashboard",
        loadChildren: ()=> import('./dashboard/dashboard.module').then(mod=>mod.DashboardModule)
      },
      {
        path:"recruitment",
        loadChildren: ()=> import('./recruitment/recruitment.module').then(mod=>mod.RecruitmentModule)
      },
      {
        path:"administration",
        component: AdminComponent
      },{
        path:"calendar",
        component: CalendarComponent
      }
      ,{
        path:"tasks",
        component: RecruitmentComponent
      }
      ,{
        path:"settings",
        component: SettingsComponent
      }
    ]
  },
 
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
