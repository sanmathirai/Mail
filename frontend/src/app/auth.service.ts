import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable <any>{
     return this.http.post(`http://localhost:8080/registerUser`, user);
  }

  loginUser(user): Observable <any>{
    return this.http.post<any>(`http://localhost:8080/login`,user);
  }
  updatePassword(user): Observable <any>{
    return this.http.put<any>(`http://localhost:8080/change-password`,user);
  }
}
