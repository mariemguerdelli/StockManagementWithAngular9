import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFourComponent } from './list-four.component';

describe('ListFournisseurComponent', () => {
  let component: ListFourComponent;
  let fixture: ComponentFixture<ListFourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListFourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListFourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
