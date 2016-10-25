import { Component, Input, Output, EventEmitter } from '@angular/core';
import { OnChanges } from '@angular/core';


@Component({
  selector: 'ctl-pagination',
  templateUrl: './pagination.component.html'
})
export class CtlPaginationComponent implements OnChanges {
  @Input() items = [];
  @Input('page-size') pageSize = 10;
  @Output('page-changed') pageChanged = new EventEmitter();
  pages: any[];
  currentPage;

  ngOnChanges() {
    let pageCount = this.items.length / this.pageSize;
    this.pages = [];
    for (let i = 1; i < pageCount; i++)
      this.pages.push(i);
  }

  changePage(page) {
    this.currentPage = page;
    this.pageChanged.emit(page);
  }

  previous() {

    if (this.currentPage === 1)
      return;

    this.currentPage--;
    this.pageChanged.emit(this.currentPage);
  }

  next() {
    if (this.currentPage === this.pages.length)
      return;

    this.currentPage++;
    this.pageChanged.emit(this.currentPage);
  }

}
