export class MockRouter {
  navigate = jasmine.createSpy('navigate');

  createUrlTree = jasmine.createSpy('createUrlTree');

  events = {
    subscribe: jasmine.createSpy('subscribe')
  };

}
