import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'thanks',
  styles: [`
  `],
  template: `
    <div class="container">
      <div class="row">
        <div class="col-sm-12">
          <div class="alert alert-info">
            <h4 class="text-center">Thank you for your submission. 
            A representative will be reaching out to you within 24 hours.</h4>
          </div>
        </div>
        </div>
        <div class="row">
          <div class="col-sm-12">
            <h2 class="text-success"><svg class="cyclops-icon" aria-hidden="true">
            <use xlink:href='#icon-phone' /></svg> Contact Us</h2>
          </div>
        </div>
      
      <section>
          <div class="row">
            <div class="col-sm-12">
              <div class="card">
                <div class="card-block">
                  <h4 class="card-title">CenturyLink Cloud Office</h4>
                  <p class="card-text">1100 112th Avenue NE Suite 400.</p>
                  <p class="card-text">Bellevue, WA 98004</p>
                  <p class="card-text"><a class="text-success" href="#">
                  <svg class="cyclops-icon" aria-hidden="true">
                  <use xlink:href='#icon-globe' /></svg>
                   View Map</a></p>
                  <p class="card-text">General: 1.877.388.4373</p>
                  <p class="card-text">Sales: 1.855.388.1260</p>
                </div>
              </div>
            </div>
          </div>
      </section>
      </div>
  `
})

export class ThankComponent {

}
