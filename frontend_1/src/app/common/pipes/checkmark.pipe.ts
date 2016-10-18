import { Pipe, PipeTransform } from '@angular/core';

@Pipe ({ name: 'checkmark' })
export class CheckmarkPipe implements PipeTransform {
    transform(value: number) {
        return value > 0 ? '\u2713' : '\u2718';
    }
}
