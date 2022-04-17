import { TestBed } from '@angular/core/testing';

import { ProtfolioService } from './protfolio.service';

describe('ProtfolioService', () => {
  let service: ProtfolioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProtfolioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
